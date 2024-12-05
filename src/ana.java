import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ana extends an7 {
   public int d;
   public int c;
   public int g;
   public int f;
   public int e;

   public ana() {
      this.else = true;
   }

   public ana(int var1, int var2, int var3, y6 var4) {
      this.else = true;
      this.d = var1;
      this.c = var2;
      this.g = var3;
      this.f = var4.new(var1, var2, var3);
      this.e = var4.for(var1, var2, var3);
   }

   public void for(DataInputStream var1) {
      this.d = var1.readInt();
      this.c = var1.read();
      this.g = var1.readInt();
      this.f = var1.readShort();
      this.e = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.d);
      var1.write(this.c);
      var1.writeInt(this.g);
      var1.writeShort(this.f);
      var1.write(this.e);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 11;
   }
}
