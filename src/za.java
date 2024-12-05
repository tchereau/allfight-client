public class za {
   public int a = 1;
   public boolean if = false;

   public za(String var1) {
      if (var1.equals("4")) {
         this.a = 4;
      } else if (var1.equals("2")) {
         this.a = 2;
      } else if (var1.equals("F")) {
         this.if = true;
      } else if (var1.equals("4F")) {
         this.a = 4;
         this.if = true;
      } else if (var1.equals("2F")) {
         this.a = 2;
         this.if = true;
      } else {
         qs.for("NaturalTextures: Unknown type: " + var1);
      }
   }

   public boolean a() {
      if (this.a != 2 && this.a != 4) {
         return this.if;
      } else {
         return true;
      }
   }
}
