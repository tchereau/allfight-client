import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;

public class ib extends i5 {
   private ju kC;
   private final ol kB;
   private j6 kE;
   private j6 kD;

   public ib(ol var1) {
      this.kB = var1;
   }

   public void dG() {
      this.kC.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(this.kE = new j6(0, this.hV / 2 - 100, this.hU / 4 + 96 + 12, var1.a("gui.done")));
      this.hT.add(this.kD = new j6(1, this.hV / 2 - 100, this.hU / 4 + 120 + 12, var1.a("gui.cancel")));
      this.kC = new ju(this.hR, this.hV / 2 - 150, 60, 300, 20);
      this.kC.M(32767);
      this.kC.h(true);
      this.kC.case(this.kB.gF());
      this.kE.hu = this.kC.dc().trim().length() > 0;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.hW.a((i5)null);
         } else if (var1.hv == 0) {
            String var2 = "MC|AdvCdm";
            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4 = new DataOutputStream(var3);

            try {
               var4.writeInt(this.kB.new);
               var4.writeInt(this.kB.int);
               var4.writeInt(this.kB.for);
               an7.a(this.kC.dc(), var4);
               this.hW.hU().for((an7)(new aov(var2, var3.toByteArray())));
            } catch (Exception var6) {
               var6.printStackTrace();
            }

            this.hW.a((i5)null);
         }

      }
   }

   protected void if(char var1, int var2) {
      this.kC.a(var1, var2);
      this.kE.hu = this.kC.dc().trim().length() > 0;
      if (var2 != 28 && var1 != '\r') {
         if (var2 == 1) {
            this.a(this.kD);
         }
      } else {
         this.a(this.kE);
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.kC.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("advMode.setCommand"), this.hV / 2, this.hU / 4 - 60 + 20, 16777215);
      this.if(this.hR, var4.a("advMode.command"), this.hV / 2 - 150, 47, 10526880);
      this.if(this.hR, var4.a("advMode.nearestPlayer"), this.hV / 2 - 150, 97, 10526880);
      this.if(this.hR, var4.a("advMode.randomPlayer"), this.hV / 2 - 150, 108, 10526880);
      this.if(this.hR, var4.a("advMode.allPlayers"), this.hV / 2 - 150, 119, 10526880);
      this.kC.db();
      super.if(var1, var2, var3);
   }
}
