import java.io.IOException;
import java.io.UnsupportedEncodingException;

class hp extends hg {
   private final String byte;
   private final String try;
   private final String new;
   // $FF: synthetic field
   final hr int;

   public hp(hr var1, String var2, String var3, String var4) {
      this.int = var1;
      this.byte = var2;
      this.try = var3;
      this.new = var4;
   }

   public void run() {
      String var1 = aqy.if().a("mco.create.world.wait");
      this.if(var1);
      gv var2 = new gv(hr.new(this.int).vg);

      try {
         var2.a(this.byte, this.try, this.new);
         hr.for(this.int).a(hr.do(this.int));
      } catch (gj var4) {
         this.a(var4.a);
      } catch (UnsupportedEncodingException var5) {
      } catch (IOException var6) {
      } catch (Exception var7) {
         this.a("Failed");
      }

   }
}
