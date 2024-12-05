import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aor extends an7 {
   public double ce;
   public double cd;
   public double ck;
   public float cj;
   public List ci;
   private float ch;
   private float cg;
   private float cf;

   public aor() {
   }

   public aor(double var1, double var3, double var5, float var7, List var8, nr var9) {
      this.ce = var1;
      this.cd = var3;
      this.ck = var5;
      this.cj = var7;
      this.ci = new ArrayList(var8);
      if (var9 != null) {
         this.ch = (float)var9.int;
         this.cg = (float)var9.for;
         this.cf = (float)var9.do;
      }

   }

   public void for(DataInputStream var1) {
      this.ce = var1.readDouble();
      this.cd = var1.readDouble();
      this.ck = var1.readDouble();
      this.cj = var1.readFloat();
      int var2 = var1.readInt();
      this.ci = new ArrayList(var2);
      int var3 = (int)this.ce;
      int var4 = (int)this.cd;
      int var5 = (int)this.ck;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.ci.add(new yp(var7, var8, var9));
      }

      this.ch = var1.readFloat();
      this.cg = var1.readFloat();
      this.cf = var1.readFloat();
   }

   public void a(DataOutputStream var1) {
      var1.writeDouble(this.ce);
      var1.writeDouble(this.cd);
      var1.writeDouble(this.ck);
      var1.writeFloat(this.cj);
      var1.writeInt(this.ci.size());
      int var2 = (int)this.ce;
      int var3 = (int)this.cd;
      int var4 = (int)this.ck;
      Iterator var5 = this.ci.iterator();

      while(var5.hasNext()) {
         yp var6 = (yp)var5.next();
         int var7 = var6.if - var2;
         int var8 = var6.a - var3;
         int var9 = var6.do - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.ch);
      var1.writeFloat(this.cg);
      var1.writeFloat(this.cf);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 32 + this.ci.size() * 3 + 3;
   }

   public float B() {
      return this.ch;
   }

   public float D() {
      return this.cg;
   }

   public float C() {
      return this.cf;
   }
}
