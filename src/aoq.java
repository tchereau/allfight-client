import java.io.DataInputStream;
import java.io.DataOutputStream;

public class aoq extends an7 {
   public static final String[] cb = new String[]{"tile.bed.notValid", null, null, "gameMode.changed"};
   public int ca;
   public int cc;

   public aoq() {
   }

   public aoq(int var1, int var2) {
      this.ca = var1;
      this.cc = var2;
   }

   public void for(DataInputStream var1) {
      this.ca = var1.readByte();
      this.cc = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeByte(this.ca);
      var1.writeByte(this.cc);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 2;
   }
}
