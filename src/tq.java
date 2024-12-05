public class tq {
   public static final tq[] d = new tq[16];
   public static final tq c = new tq(0, 0);
   public static final tq b = new tq(1, 8368696);
   public static final tq void = new tq(2, 16247203);
   public static final tq long = new tq(3, 10987431);
   public static final tq goto = new tq(4, 16711680);
   public static final tq else = new tq(5, 10526975);
   public static final tq char = new tq(6, 10987431);
   public static final tq case = new tq(7, 31744);
   public static final tq byte = new tq(8, 16777215);
   public static final tq try = new tq(9, 10791096);
   public static final tq new = new tq(10, 12020271);
   public static final tq int = new tq(11, 7368816);
   public static final tq for = new tq(12, 4210943);
   public static final tq do = new tq(13, 6837042);
   public final int if;
   public final int a;

   private tq(int var1, int var2) {
      this.a = var1;
      this.if = var2;
      d[var1] = this;
   }
}
