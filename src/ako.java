import java.net.DatagramPacket;
import java.util.Date;
import java.util.Random;

class ako {
   private long a;
   private int new;
   private byte[] int;
   private byte[] for;
   private String do;
   // $FF: synthetic field
   final akp if;

   public ako(akp var1, DatagramPacket var2) {
      this.if = var1;
      this.a = (new Date()).getTime();
      byte[] var3 = var2.getData();
      this.int = new byte[4];
      this.int[0] = var3[3];
      this.int[1] = var3[4];
      this.int[2] = var3[5];
      this.int[3] = var3[6];
      this.do = new String(this.int);
      this.new = (new Random()).nextInt(16777216);
      this.for = String.format("\t%s%d\u0000", this.do, this.new).getBytes();
   }

   public Boolean a(long var1) {
      return this.a < var1;
   }

   public int do() {
      return this.new;
   }

   public byte[] a() {
      return this.for;
   }

   public byte[] if() {
      return this.int;
   }
}
