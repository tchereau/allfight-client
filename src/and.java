import java.io.DataInputStream;
import java.io.DataOutputStream;

public class and extends an7 {
   private int t;
   private int s;
   private int w;
   private int v;
   private int u;

   public and() {
   }

   public and(int var1, int var2, int var3, int var4, int var5) {
      this.t = var1;
      this.s = var2;
      this.w = var3;
      this.v = var4;
      this.u = var5;
   }

   public void for(DataInputStream var1) {
      this.t = var1.readInt();
      this.s = var1.readInt();
      this.w = var1.readInt();
      this.v = var1.readInt();
      this.u = var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.t);
      var1.writeInt(this.s);
      var1.writeInt(this.w);
      var1.writeInt(this.v);
      var1.write(this.u);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 13;
   }

   public int try() {
      return this.t;
   }

   public int case() {
      return this.s;
   }

   public int byte() {
      return this.w;
   }

   public int new() {
      return this.v;
   }

   public int char() {
      return this.u;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      and var2 = (and)var1;
      return var2.t == this.t;
   }
}
