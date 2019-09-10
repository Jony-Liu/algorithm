package com.example.algorithm.designmode.factory;

/**
 * @author Jony-Liu
 */
public class HumanFactory {
    public Human createHuman(Class race){
        Human human= null;
        try {
            human = (Human)Class.forName(race.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return human;

		/*
		if(race.equals(BlackHuman.class) ){
			return new BlackHuman();
		}else if(race.equals(WhiteHuman.class)){
			return new WhiteHuman();
		}else{
			return new YellowHuman();
		}


	*/}
}
