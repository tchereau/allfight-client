import java.io.DataInput;
import java.io.DataOutput;

public class aqf extends aqd {
   public String do;

   public aqf(String var1) {
      super(var1);
   }

   public aqf(String var1, String var2) {
      super(var1);
      this.do = var2;
      if (var2 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) {
      var1.writeUTF(this.do);
   }

   void if(DataInput var1) {
      this.do = var1.readUTF();
   }

   public byte a() {
      return 8;
   }

   public String toString() {
      return "" + this.do;
   }

   public aqd do() {
      return new aqf(this.if(), this.do);
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else {
         aqf var2 = (aqf)var1;
         return this.do == null && var2.do == null || this.do != null && this.do.equals(var2.do);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.do.hashCode();
   }
}
