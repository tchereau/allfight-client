import java.io.DataInputStream;
import java.io.DataOutputStream;

public class anq extends an7 {
   public int ao;
   public int an;
   private abp ap;

   public anq() {
   }

   public anq(int var1, int var2, abp var3) {
      this.ao = var1;
      this.an = var2;
      this.ap = var3 == null ? null : var3.n();
   }

   public void for(DataInputStream var1) {
      this.ao = var1.readInt();
      this.an = var1.readShort();
      this.ap = do(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.ao);
      var1.writeShort(this.an);
      a(this.ap, var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 8;
   }

   public abp goto() {
      return this.ap;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      anq var2 = (anq)var1;
      return var2.ao == this.ao && var2.an == this.an;
   }
}
