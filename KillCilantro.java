public class KillCilantro {
   public static void main(String[] args) {
      System.out.print(killCilantro("cilantroveadcolantrocilantrow"));
   }
   public static String killCilantro(String input) {
      String recipe = input + " ";
      String newRecipe = "";
      String string1 = "";
      for (int i = 0; i <= input.length(); i++) {
         if (i < recipe.length() - 8 && recipe.substring(i, i + 8).equals("cilantro")) {
            newRecipe += "parsley";
            i += 7;
         } else {
            newRecipe += recipe.substring(i, i + 1);

         }
      }
      return newRecipe;
   }
}