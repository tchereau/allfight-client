import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.lwjgl.input.Keyboard;

public class gz extends i5 {
   private final i5 i0;
   private final gm iZ;
   private final int i4 = 0;
   private final int i2 = 1;
   private int i3;
   private String i1;

   public gz(i5 var1, gm var2) {
      this.i0 = var1;
      this.iZ = var2;
   }

   public void dG() {
   }

   public void dA() {
      this.a(this.iZ.g);
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.add(new j6(0, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
   }

   private void a(long var1) {
      gv var3 = new gv(this.hW.vg);

      try {
         gh var4 = var3.new(var1);
         this.i3 = var4.a;
         this.i1 = this.if(var4.if);
      } catch (gj var5) {
      } catch (IOException var6) {
      }

   }

   private String if(long var1) {
      GregorianCalendar var3 = new GregorianCalendar(TimeZone.getDefault());
      var3.setTimeInMillis(var1);
      return SimpleDateFormat.getDateTimeInstance().format(var3.getTime());
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 0) {
            this.hW.a(this.i0);
         } else if (var1.hv == 1) {
         }

      }
   }

   protected void if(char var1, int var2) {
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("mco.configure.world.subscription.title"), this.hV / 2, 17, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.subscription.start"), this.hV / 2 - 100, 53, 10526880);
      this.if(this.hR, this.i1, this.hV / 2 - 100, 66, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.subscription.daysleft"), this.hV / 2 - 100, 85, 10526880);
      this.if(this.hR, String.valueOf(this.i3), this.hV / 2 - 100, 98, 16777215);
      super.if(var1, var2, var3);
   }
}
