/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.TechAdvancement;

/**
 * @author Ben Grills
 */
public class InfantryShotgunBuccaneerGelGunWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryShotgunBuccaneerGelGunWeapon() {
		super();

		name = "Gel Gun (Buccaneer)";
		setInternalName(name);
		addLookupName("InfantryBuccaneerGelGun");
		addLookupName("Buccaneer Gel Gun");
		ammoType = AmmoType.T_NA;
		cost = 200;
		bv = 0.06;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
		infantryDamage = 0.07;
		infantryRange = 0;
		techAdvancement.setTechBase(TECH_BASE_IS).setISAdvancement(3030, 3035, 3057, DATE_NONE, DATE_NONE)
		        .setISApproximate(true, false, false, false, false)
		        .setPrototypeFactions(F_FW)
		        .setProductionFactions(F_FW).setTechRating(RATING_C)
		        .setAvailability(RATING_X, RATING_X, RATING_D, RATING_C);

	}
}
