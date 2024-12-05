import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.List;

public class ans extends an7 {
   public int av;
   private List au;

   public ans() {
   }

   public ans(int var1, ah4 var2, boolean var3) {
      this.av = var1;
      if (var3) {
         this.au = var2.for();
      } else {
         this.au = var2.if();
      }

   }

   public void for(DataInputStream var1) {
      this.av = var1.readInt();
      this.au = ah4.a(var1);
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.av);
      ah4.a(this.au, var1);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 5;
   }

   public List long() {
      return this.au;
   }
}
