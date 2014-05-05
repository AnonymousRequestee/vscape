package com.rs2.model.content.combat.weapon;

import com.rs2.model.players.Player;
import com.rs2.model.players.item.ItemDefinition;

//Really basic weapon sounds class
public class CombatSounds {
	
	private Player player;

	public CombatSounds(Player player) {
		this.player = player;
	}
	
	public int getWeaponSound(int weaponId)
	{
		if(weaponId <= 0)
		{
			return 417;
		}
		String weaponName = ItemDefinition.forId(weaponId).getName().toLowerCase();
		if(weaponName.contains("whip")) {
			return 1080;
		} else if(weaponName.contains("scimitar") || weaponName.contains("sword") && !weaponName.contains("2h")) {
			return 396;
		} else if (weaponName.contains("dragon dagger") || weaponName.contains("drag dagger")) {
			return 793;
		} else if (weaponName.contains("2h sword") || weaponName.contains("2h")) {
			return 398;
		} else if (weaponName.contains("halberd")) {
			return 420;
		} else if (weaponName.contains("axe") || weaponName.contains("battleaxe") && !weaponName.contains("throw")) {
			return 399;
		} else if (weaponName.contains("staff")) {
			return 394;
		} else if (weaponName.contains("mace")) {
			return 387;
		} else if (weaponName.contains("dharok")) {
			return 1057;
		} else if (weaponName.contains("torag")) {
			return 1062;
		} else if (weaponName.contains("guthan")) {
			return 1061;
		} else if (weaponName.contains("verec")) {
			return 1059;
		} else if (weaponName.contains("granite maul")) {
			return 1079;
		} else if (weaponName.contains("longbow") || weaponName.contains("shortbow") || weaponName.contains("c'bow")) {
			return 370;
		} else if (weaponName.contains("crystal bow")) {
			return 386;
		}
		return 0;
	}
	
	public void weaponSound()
	{
		int soundId = getWeaponSound(player.getEquipment().getId(3));
		if(soundId > 0)
		{
			player.getActionSender().sendSound(soundId,0,0);
		}
	}
	
}
