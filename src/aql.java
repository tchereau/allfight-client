import java.io.DataInput;
import java.io.DataOutput;

public class aql extends aqd {
   public long int;

   public aql(String var1) {
      super(var1);
   }

   public aql(String var1, long var2) {
      super(var1);
      this.int = var2;
   }

   void a(DataOutput var1) {
      var1.writeLong(this.int);
   }

   void if(DataInput var1) {
      this.int = var1.readLong();
   }

   public byte a() {
      return 4;
   }

   public String toString() {
      return "" + this.int;
   }

   public aqd do() {
      return new aql(this.if(), this.int);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aql var2 = (aql)var1;
         return this.int == var2.int;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ (int)(this.int ^ this.int >>> 32);
   }
}
