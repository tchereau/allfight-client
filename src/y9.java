import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class y9 {
   private String for = null;
   private String do = null;
   private int case = -1;
   private int byte = 0;
   private int try = 0;
   private int char = 0;
   private int if = 0;
   private aw[] new = null;
   private int int = 0;
   private ByteBuffer a = null;

   public y9(String var1, byte[] var2, String var3, int var4, int var5, int var6, int var7, int var8, Properties var9, int var10) {
      this.for = var1;
      this.do = var3;
      this.case = var4;
      this.byte = var5;
      this.try = var6;
      this.char = var7;
      this.if = var8;
      int var11 = var7 * var8 * 4;
      if (var2.length % var11 != 0) {
         qs.for("Invalid animated texture length: " + var2.length + ", frameWidth: " + var8 + ", frameHeight: " + var8);
      }

      this.a = k0.for(var2.length);
      this.a.put(var2);
      int var12 = var2.length / var11;
      if (var9.get("tile.0") != null) {
         for(int var13 = 0; var9.get("tile." + var13) != null; ++var13) {
            var12 = var13 + 1;
         }
      }

      String var21 = (String)var9.get("duration");
      int var14 = qs.a(var21, var10);
      this.new = new aw[var12];

      for(int var15 = 0; var15 < this.new.length; ++var15) {
         String var16 = (String)var9.get("tile." + var15);
         int var17 = qs.a(var16, var15);
         String var18 = (String)var9.get("duration." + var15);
         int var19 = qs.a(var18, var14);
         aw var20 = new aw(var17, var19);
         this.new[var15] = var20;
      }

   }

   public boolean if() {
      if (this.new.length <= 0) {
         return false;
      } else {
         if (this.int >= this.new.length) {
            this.int = 0;
         }

         aw var1 = this.new[this.int];
         ++var1.a;
         if (var1.a < var1.do) {
            return false;
         } else {
            var1.a = 0;
            ++this.int;
            if (this.int >= this.new.length) {
               this.int = 0;
            }

            return true;
         }
      }
   }

   public int for() {
      if (this.new.length <= 0) {
         return 0;
      } else {
         if (this.int >= this.new.length) {
            this.int = 0;
         }

         aw var1 = this.new[this.int];
         return var1.if;
      }
   }

   public int do() {
      return this.new.length;
   }

   public boolean a() {
      if (!this.if()) {
         return false;
      } else {
         int var1 = this.char * this.if * 4;
         int var2 = this.for();
         int var3 = var1 * var2;
         if (var3 + var1 > this.a.capacity()) {
            return false;
         } else {
            this.a.position(var3);
            qs.q().do(this.case);
            GL11.glTexSubImage2D(3553, 0, this.byte, this.try, this.char, this.if, 6408, 5121, this.a);
            return true;
         }
      }
   }
}
