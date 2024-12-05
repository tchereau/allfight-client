import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anb extends an7 {
   public int i;
   public int h;
   public int m;
   public int l;
   public int k;
   public int j;

   public anb() {
   }

   public anb(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.i = var1;
      this.h = var2;
      this.m = var3;
      this.l = var5;
      this.k = var6;
      this.j = var4;
   }

   public void for(DataInputStream var1) {
      this.i = var1.readInt();
      this.h = var1.readShort();
      this.m = var1.readInt();
      this.l = var1.read();
      this.k = var1.read();
      this.j = var1.readShort() & 4095;
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.i);
      var1.writeShort(this.h);
      var1.writeInt(this.m);
      var1.write(this.l);
      var1.write(this.k);
      var1.writeShort(this.j & 4095);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 14;
   }
}
