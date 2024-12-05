import java.io.DataInputStream;
import java.io.DataOutputStream;

public class am8 extends an7 {
   private int ec;
   private int eb;
   private int ei;
   private int eh;
   private abp eg;
   private float ef;
   private float ee;
   private float ed;

   public am8() {
   }

   public am8(int var1, int var2, int var3, int var4, abp var5, float var6, float var7, float var8) {
      this.ec = var1;
      this.eb = var2;
      this.ei = var3;
      this.eh = var4;
      this.eg = var5 != null ? var5.n() : null;
      this.ef = var6;
      this.ee = var7;
      this.ed = var8;
   }

   public void for(DataInputStream var1) {
      this.ec = var1.readInt();
      this.eb = var1.read();
      this.ei = var1.readInt();
      this.eh = var1.read();
      this.eg = do(var1);
      this.ef = (float)var1.read() / 16.0F;
      this.ee = (float)var1.read() / 16.0F;
      this.ed = (float)var1.read() / 16.0F;
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.ec);
      var1.write(this.eb);
      var1.writeInt(this.ei);
      var1.write(this.eh);
      a(this.eg, var1);
      var1.write((int)(this.ef * 16.0F));
      var1.write((int)(this.ee * 16.0F));
      var1.write((int)(this.ed * 16.0F));
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 19;
   }

   public int S() {
      return this.ec;
   }

   public int W() {
      return this.eb;
   }

   public int U() {
      return this.ei;
   }

   public int R() {
      return this.eh;
   }

   public abp Q() {
      return this.eg;
   }

   public float X() {
      return this.ef;
   }

   public float V() {
      return this.ee;
   }

   public float T() {
      return this.ed;
   }
}
