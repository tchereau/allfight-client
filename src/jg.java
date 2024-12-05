import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

class jg extends i3 {
   private ArrayList w;
   private TreeMap y;
   // $FF: synthetic field
   final jh x;

   public jg(jh var1) {
      super(var1.hW, var1.hV, var1.hU, 32, var1.hU - 65 + 4, 18);
      this.x = var1;
      this.y = aqy.if().a();
      this.w = new ArrayList();
      Iterator var2 = this.y.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.w.add(var3);
      }

   }

   protected int new() {
      return this.w.size();
   }

   protected void a(int var1, boolean var2) {
      aqy.if().a((String)this.w.get(var1), false);
      this.x.hW.va.a(aqy.if().for());
      jh.if(this.x).a8 = (String)this.w.get(var1);
      this.x.hR.if(aqy.do(jh.if(this.x).a8));
      jh.a(this.x).hw = aqy.if().a("gui.done");
      jh.if(this.x).new();
   }

   protected boolean a(int var1) {
      return ((String)this.w.get(var1)).equals(aqy.if().int());
   }

   protected int if() {
      return this.new() * 18;
   }

   protected void int() {
      this.x.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      this.x.hR.if(true);
      this.x.a(this.x.hR, (String)this.y.get(this.w.get(var1)), this.x.hV / 2, var3 + 1, 16777215);
      this.x.hR.if(aqy.do(jh.if(this.x).a8));
   }
}
