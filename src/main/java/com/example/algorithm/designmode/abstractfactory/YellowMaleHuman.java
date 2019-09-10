package com.example.algorithm.designmode.abstractfactory;

/**
 * @author Jony-Liu
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    public void sex(){
        System.out.println("该黄种人的性别为男");
    }
}
class WhiteMaleHuman  extends AbstractWhiteHuman {
    public void sex(){
        System.out.println("该白种人的性别为男");
    }
}
class BlackMaleHuman   extends AbstractBlackHuman {
    public void sex(){
        System.out.println("该黄种人的性别为男");
    }
}
class YellowFemaleHuman extends AbstractYellowHuman  {
    public void sex(){
        System.out.println("该黄种人的性别为女");
    }
}
class WhiteFemaleHuman  extends AbstractWhiteHuman {
    public void sex(){
        System.out.println("该白种人的性别为女");
    }
}
class BlackFemaleHuman   extends AbstractBlackHuman {
    public void sex(){
        System.out.println("该黄种人的性别为女");
    }
}
