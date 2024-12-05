import java.util.ArrayList;
import java.util.Collections;
import net.minecraft.client.Minecraft;

public class hi extends i5 {
   private final int jy = 666;
   private final i5 jx;
   private final Thread jw;
   private volatile String jv = "";
   private volatile boolean ju = false;
   private volatile String jt;
   private volatile boolean js = false;
   private int jr = 0;
   private hg jA;
   public static final String[] jz = new String[]{"▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃", "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄", "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅", "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆", "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇", "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █", "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇", "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆", "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅", "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄", "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃", "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _", "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _", "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _", "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _", "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _", "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _", "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _", "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _", "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _"};

   public hi(Minecraft var1, i5 var2, hg var3) {
      super.hT = Collections.synchronizedList(new ArrayList());
      this.hW = var1;
      this.jx = var2;
      this.jA = var3;
      var3.a(this);
      this.jw = new Thread(var3);
   }

   public void dO() {
      this.jw.start();
   }

   public void dG() {
      super.dG();
      ++this.jr;
      this.jA.if();
   }

   protected void if(char var1, int var2) {
   }

   public void dA() {
      this.jA.for();
   }

   protected void a(j6 var1) {
      if (var1.hv == 666) {
         this.js = true;
         this.hW.a(this.jx);
      }

      this.jA.a(var1);
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.jv, this.hV / 2, this.hU / 2 - 50, 16777215);
      this.a(this.hR, "", this.hV / 2, this.hU / 2 - 10, 16777215);
      if (!this.ju) {
         this.a(this.hR, jz[this.jr % jz.length], this.hV / 2, this.hU / 2 + 15, 8421504);
      }

      if (this.ju) {
         this.a(this.hR, this.jt, this.hV / 2, this.hU / 2 + 15, 16711680);
      }

      super.if(var1, var2, var3);
   }

   public void f(String var1) {
      this.ju = true;
      this.jt = var1;
      this.hT.clear();
      this.hT.add(new j6(666, this.hV / 2 - 100, this.hU / 4 + 120 + 12, "Back"));
   }

   public Minecraft dP() {
      return this.hW;
   }

   public void e(String var1) {
      this.jv = var1;
   }

   public boolean dN() {
      return this.js;
   }
}
