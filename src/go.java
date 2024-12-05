public class go extends gg {
   public String i;
   public String h;

   public static go if(l6 var0) {
      go var1 = new go();
      var1.i = var0.for("locationId");
      var1.h = var0.for("locationName");
      return var1;
   }

   public static go a(l6 var0, String var1) {
      go var2 = new go();
      var2.i = var0.for(var1, "locationId");
      var2.h = var0.for(var1, "locationName");
      return var2;
   }
}
