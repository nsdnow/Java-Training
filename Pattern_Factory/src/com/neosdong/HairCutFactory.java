package com.neosdong;

/**
 * 工厂：发廊
 * @author leon
 *
 */
public class HairCutFactory {
	public static HairCutSkill getHairCutSkill(String hairCutType){
		if (hairCutType=="left") {
			return new LeftHair();
		}
		else if (hairCutType=="right") {
			return new RightHair();
		}
		else {
			return null;
		}
	}
	
	public static HairCutSkill getHairCutByClass(String className){
		HairCutSkill hairCutSkill = null;
		try {
			hairCutSkill = (HairCutSkill) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hairCutSkill;
	}
}
