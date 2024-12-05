import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ao9 extends an7 {
   private String c3;
   private int c2;
   private int c7;
   private boolean c6;
   private int c5;
   private boolean c4;

   public ao9() {
   }

   public ao9(String var1, int var2, int var3, boolean var4, int var5, boolean var6) {
      this.c3 = var1;
      this.c2 = var2;
      this.c7 = var3;
      this.c6 = var4;
      this.c5 = var5;
      this.c4 = var6;
   }

   public void for(DataInputStream var1) {
      this.c3 = a(var1, 7);
      this.c2 = var1.readByte();
      byte var2 = var1.readByte();
      this.c7 = var2 & 7;
      this.c6 = (var2 & 8) == 8;
      this.c5 = var1.readByte();
      this.c4 = var1.readBoolean();
   }

   public void a(DataOutputStream var1) {
      a(this.c3, var1);
      var1.writeByte(this.c2);
      var1.writeByte(this.c7 | (this.c6 ? 1 : 0) << 3);
      var1.writeByte(this.c5);
      var1.writeBoolean(this.c4);
   }

   public void a(an6 var1) {
      var1.a(this);
   }

   public int for() {
      return 7;
   }

   public String I() {
      return this.c3;
   }

   public int J() {
      return this.c2;
   }

   public int H() {
      return this.c7;
   }

   public boolean G() {
      return this.c6;
   }

   public int L() {
      return this.c5;
   }

   public boolean K() {
      return this.c4;
   }

   public boolean if() {
      return true;
   }

   public boolean a(an7 var1) {
      return true;
   }
}
