import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoh extends an7 {
   private String bt;
   private int bs;
   private int bx = Integer.MAX_VALUE;
   private int bw;
   private float bv;
   private int bu;

   public aoh() {
   }

   public aoh(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.bt = var1;
      this.bs = (int)(var2 * 8.0D);
      this.bx = (int)(var4 * 8.0D);
      this.bw = (int)(var6 * 8.0D);
      this.bv = var8;
      this.bu = (int)(var9 * 63.0F);
      if (this.bu < 0) {
         this.bu = 0;
      }

      if (this.bu > 255) {
         this.bu = 255;
      }

   }

   public void for(DataInputStream var1) {
      this.bt = a(var1, 32);
      this.bs = var1.readInt();
      this.bx = var1.readInt();
      this.bw = var1.readInt();
      this.bv = var1.readFloat();
      this.bu = var1.readUnsignedByte();
   }

   public void a(DataOutputStream var1) {
      a(this.bt, var1);
      var1.writeInt(this.bs);
      var1.writeInt(this.bx);
      var1.writeInt(this.bw);
      var1.writeFloat(this.bv);
      var1.writeByte(this.bu);
   }

   public String k() {
      return this.bt;
   }

   public double n() {
      return (double)((float)this.bs / 8.0F);
   }

   public double l() {
      return (double)((float)this.bx / 8.0F);
   }

   public double j() {
      return (double)((float)this.bw / 8.0F);
   }

   public float o() {
      return this.bv;
   }

   public float m() {
      return (float)this.bu / 63.0F;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 24;
   }
}
