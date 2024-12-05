import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class aqp extends aqd {
   public int[] case;

   public aqp(String var1) {
      super(var1);
   }

   public aqp(String var1, int[] var2) {
      super(var1);
      this.case = var2;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.case.length);

      for(int var2 = 0; var2 < this.case.length; ++var2) {
         var1.writeInt(this.case[var2]);
      }

   }

   void if(DataInput var1) {
      int var2 = var1.readInt();
      this.case = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.case[var3] = var1.readInt();
      }

   }

   public byte a() {
      return 11;
   }

   public String toString() {
      return "[" + this.case.length + " bytes]";
   }

   public aqd do() {
      int[] var1 = new int[this.case.length];
      System.arraycopy(this.case, 0, var1, 0, this.case.length);
      return new aqp(this.if(), var1);
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         aqp var2 = (aqp)var1;
         return this.case == null && var2.case == null || this.case != null && Arrays.equals(this.case, var2.case);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.case);
   }
}
