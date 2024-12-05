import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class c0 extends cy {
   private static c0 byte = new c0();
   private FloatBuffer try = k0.if(16);
   private FloatBuffer new = k0.if(16);
   private FloatBuffer int = k0.if(16);

   public static cy if() {
      byte.a();
      return byte;
   }

   private void a(float[][] var1, int var2) {
      float var3 = ajs.if(var1[var2][0] * var1[var2][0] + var1[var2][1] * var1[var2][1] + var1[var2][2] * var1[var2][2]);
      var1[var2][0] /= var3;
      var1[var2][1] /= var3;
      var1[var2][2] /= var3;
      var1[var2][3] /= var3;
   }

   private void a() {
      this.try.clear();
      this.new.clear();
      this.int.clear();
      GL11.glGetFloat(2983, this.try);
      GL11.glGetFloat(2982, this.new);
      this.try.flip().limit(16);
      this.try.get(this.a);
      this.new.flip().limit(16);
      this.new.get(this.for);
      this.do[0] = this.for[0] * this.a[0] + this.for[1] * this.a[4] + this.for[2] * this.a[8] + this.for[3] * this.a[12];
      this.do[1] = this.for[0] * this.a[1] + this.for[1] * this.a[5] + this.for[2] * this.a[9] + this.for[3] * this.a[13];
      this.do[2] = this.for[0] * this.a[2] + this.for[1] * this.a[6] + this.for[2] * this.a[10] + this.for[3] * this.a[14];
      this.do[3] = this.for[0] * this.a[3] + this.for[1] * this.a[7] + this.for[2] * this.a[11] + this.for[3] * this.a[15];
      this.do[4] = this.for[4] * this.a[0] + this.for[5] * this.a[4] + this.for[6] * this.a[8] + this.for[7] * this.a[12];
      this.do[5] = this.for[4] * this.a[1] + this.for[5] * this.a[5] + this.for[6] * this.a[9] + this.for[7] * this.a[13];
      this.do[6] = this.for[4] * this.a[2] + this.for[5] * this.a[6] + this.for[6] * this.a[10] + this.for[7] * this.a[14];
      this.do[7] = this.for[4] * this.a[3] + this.for[5] * this.a[7] + this.for[6] * this.a[11] + this.for[7] * this.a[15];
      this.do[8] = this.for[8] * this.a[0] + this.for[9] * this.a[4] + this.for[10] * this.a[8] + this.for[11] * this.a[12];
      this.do[9] = this.for[8] * this.a[1] + this.for[9] * this.a[5] + this.for[10] * this.a[9] + this.for[11] * this.a[13];
      this.do[10] = this.for[8] * this.a[2] + this.for[9] * this.a[6] + this.for[10] * this.a[10] + this.for[11] * this.a[14];
      this.do[11] = this.for[8] * this.a[3] + this.for[9] * this.a[7] + this.for[10] * this.a[11] + this.for[11] * this.a[15];
      this.do[12] = this.for[12] * this.a[0] + this.for[13] * this.a[4] + this.for[14] * this.a[8] + this.for[15] * this.a[12];
      this.do[13] = this.for[12] * this.a[1] + this.for[13] * this.a[5] + this.for[14] * this.a[9] + this.for[15] * this.a[13];
      this.do[14] = this.for[12] * this.a[2] + this.for[13] * this.a[6] + this.for[14] * this.a[10] + this.for[15] * this.a[14];
      this.do[15] = this.for[12] * this.a[3] + this.for[13] * this.a[7] + this.for[14] * this.a[11] + this.for[15] * this.a[15];
      this.if[0][0] = this.do[3] - this.do[0];
      this.if[0][1] = this.do[7] - this.do[4];
      this.if[0][2] = this.do[11] - this.do[8];
      this.if[0][3] = this.do[15] - this.do[12];
      this.a(this.if, 0);
      this.if[1][0] = this.do[3] + this.do[0];
      this.if[1][1] = this.do[7] + this.do[4];
      this.if[1][2] = this.do[11] + this.do[8];
      this.if[1][3] = this.do[15] + this.do[12];
      this.a(this.if, 1);
      this.if[2][0] = this.do[3] + this.do[1];
      this.if[2][1] = this.do[7] + this.do[5];
      this.if[2][2] = this.do[11] + this.do[9];
      this.if[2][3] = this.do[15] + this.do[13];
      this.a(this.if, 2);
      this.if[3][0] = this.do[3] - this.do[1];
      this.if[3][1] = this.do[7] - this.do[5];
      this.if[3][2] = this.do[11] - this.do[9];
      this.if[3][3] = this.do[15] - this.do[13];
      this.a(this.if, 3);
      this.if[4][0] = this.do[3] - this.do[2];
      this.if[4][1] = this.do[7] - this.do[6];
      this.if[4][2] = this.do[11] - this.do[10];
      this.if[4][3] = this.do[15] - this.do[14];
      this.a(this.if, 4);
      this.if[5][0] = this.do[3] + this.do[2];
      this.if[5][1] = this.do[7] + this.do[6];
      this.if[5][2] = this.do[11] + this.do[10];
      this.if[5][3] = this.do[15] + this.do[14];
      this.a(this.if, 5);
   }
}
