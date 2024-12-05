public class gh extends gg {
   public long if;
   public int a;

   public static gh a(String var0) {
      gh var1 = new gh();

      try {
         lh var2 = (new mh()).a(var0);
         var1.if = Long.parseLong(var2.a(new Object[]{"startDate"}));
         var1.a = Integer.parseInt(var2.a(new Object[]{"daysLeft"}));
      } catch (ld var3) {
      } catch (IllegalArgumentException var4) {
      }

      return var1;
   }
}
