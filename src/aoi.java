import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoi extends an7 {
   private String bG;
   private float bF;
   private float bE;
   private float bD;
   private float bC;
   private float bB;
   private float bA;
   private float bz;
   private int by;

   public void for(DataInputStream var1) {
      this.bG = a(var1, 64);
      this.bF = var1.readFloat();
      this.bE = var1.readFloat();
      this.bD = var1.readFloat();
      this.bC = var1.readFloat();
      this.bB = var1.readFloat();
      this.bA = var1.readFloat();
      this.bz = var1.readFloat();
      this.by = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      a(this.bG, var1);
      var1.writeFloat(this.bF);
      var1.writeFloat(this.bE);
      var1.writeFloat(this.bD);
      var1.writeFloat(this.bC);
      var1.writeFloat(this.bB);
      var1.writeFloat(this.bA);
      var1.writeFloat(this.bz);
      var1.writeInt(this.by);
   }

   public String s() {
      return this.bG;
   }

   public double w() {
      return (double)this.bF;
   }

   public double t() {
      return (double)this.bE;
   }

   public double q() {
      return (double)this.bD;
   }

   public float x() {
      return this.bC;
   }

   public float u() {
      return this.bB;
   }

   public float r() {
      return this.bA;
   }

   public float p() {
      return this.bz;
   }

   public int v() {
      return this.by;
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 64;
   }
}
