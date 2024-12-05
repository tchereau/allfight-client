import java.util.Random;

public class h3 {
   public static final h3 if = new h3();
   private Random a = new Random();
   private String[] do = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");

   private h3() {
   }

   public String a() {
      int var1 = this.a.nextInt(2) + 3;
      String var2 = "";

      for(int var3 = 0; var3 < var1; ++var3) {
         if (var3 > 0) {
            var2 = var2 + " ";
         }

         var2 = var2 + this.do[this.a.nextInt(this.do.length)];
      }

      return var2;
   }

   public void a(long var1) {
      this.a.setSeed(var1);
   }
}
