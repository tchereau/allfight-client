import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aqm extends aqd {
   private List new = new ArrayList();
   private byte try;

   public aqm() {
      super("");
   }

   public aqm(String var1) {
      super(var1);
   }

   void a(DataOutput var1) {
      if (!this.new.isEmpty()) {
         this.try = ((aqd)this.new.get(0)).a();
      } else {
         this.try = 1;
      }

      var1.writeByte(this.try);
      var1.writeInt(this.new.size());

      for(int var2 = 0; var2 < this.new.size(); ++var2) {
         ((aqd)this.new.get(var2)).a(var1);
      }

   }

   void if(DataInput var1) {
      this.try = var1.readByte();
      int var2 = var1.readInt();
      this.new = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         aqd var4 = aqd.a(this.try, (String)null);
         var4.if(var1);
         this.new.add(var4);
      }

   }

   public byte a() {
      return 9;
   }

   public String toString() {
      return "" + this.new.size() + " entries of type " + aqd.a(this.try);
   }

   public void a(aqd var1) {
      this.try = var1.a();
      this.new.add(var1);
   }

   public aqd if(int var1) {
      return (aqd)this.new.remove(var1);
   }

   public aqd a(int var1) {
      return (aqd)this.new.get(var1);
   }

   public int for() {
      return this.new.size();
   }

   public aqd do() {
      aqm var1 = new aqm(this.if());
      var1.try = this.try;
      Iterator var2 = this.new.iterator();

      while(var2.hasNext()) {
         aqd var3 = (aqd)var2.next();
         aqd var4 = var3.do();
         var1.new.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqm var2 = (aqm)var1;
         if (this.try == var2.try) {
            return this.new.equals(var2.new);
         }
      }

      return false;
   }

   public int hashCode() {
      return super.hashCode() ^ this.new.hashCode();
   }
}
