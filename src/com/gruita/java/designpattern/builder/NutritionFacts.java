package com.gruita.java.designpattern.builder;

/**
 * 
 * @author cristian.gruita
 * 
 *         Not a design pattern itself, but very useful when dealing with a long
 *         list of parameters that have to be passed on to the constructor.
 *         Also, when we have required and optional parameters. From Joshua
 *         Bloch's "Effective Java", the builder pattern
 */
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {

		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	private void show() {
		System.out.print("object has values: " + "\n\tserving Size: "
				+ this.servingSize);
		System.out.print("\n\tservings: " + this.servings);
		System.out.print("\n\tcalories: " + this.calories);
		System.out.print("\n\tsodium: " + this.sodium);
		System.out.print("\n\tcarbs: " + this.carbohydrate);

	}

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		cocaCola.show();
	}

}
