package com.example.helldivers2stratagempicker20

import androidx.compose.ui.res.stringResource

enum class stratType(name: String){
    ORBITAL("orbital"),
    EAGLE("eagle"),
    WEAPON("weapon"),
    BACKPACK("backpack"),
    SENTRY("sentry"),
    EMPLACEMENT("emplacement"),
    VEHICLE("vehicle"),
    ANY("any"),
    OTHER("other")
}

class Stratagem(val name:String, val typ: String, val enemy:String, val tags: List<String>, val displayNameID: Int, val iconId: Int)

val stratagemList: List<Stratagem> = listOf(
    //orbital
    Stratagem(name="orbital_precision", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_precision, iconId = R.drawable.orbital_precision_strike_icon),
    Stratagem(name="orbital_airburst", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_airburst, iconId = R.drawable.orbital_airburst_strike_icon),
    Stratagem(name="orbital_120mm", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_120mm, iconId = R.drawable.orbital_120mm_he_barrage_icon),
    Stratagem(name="orbital_380mm", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_380mm, iconId = R.drawable.orbital_380mm_he_barrage_icon),
    Stratagem(name="orbital_walking", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_walking, iconId = R.drawable.orbital_walking_barrage_icon),
    Stratagem(name="orbital_laser", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_laser, iconId = R.drawable.orbital_laser_icon),
    Stratagem(name="orbital_railcannon", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_railcannon, iconId = R.drawable.orbital_railcannon_strike_icon),
    Stratagem(name="orbital_gatling", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_gatling, iconId = R.drawable.orbital_gatling_barrage_icon),
    Stratagem(name="orbital_gas", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_gas, iconId = R.drawable.orbital_gas_strike_icon),
    Stratagem(name="orbital_ems", typ=stratType.ORBITAL.name, enemy="any", tags=listOf(), displayNameID = R.string.orbital_ems, iconId = R.drawable.orbital_ems_strike_icon),
    Stratagem(name="orbital_smoke", typ=stratType.ORBITAL.name, enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.orbital_smoke, iconId = R.drawable.orbital_smoke_strike_icon),
    Stratagem(name="orbital_napalm", typ=stratType.ORBITAL.name, enemy="terminids", tags=listOf(), displayNameID = R.string.orbital_napalm, iconId = R.drawable.orbital_napalm_barrage_stratagem_icon),
    //eagle
    Stratagem(name="eagle_strafing", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_strafing, iconId = R.drawable.eagle_strafing_run_icon),
    Stratagem(name="eagle_airstrike", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_airstrike, iconId = R.drawable.eagle_airstrike_icon),
    Stratagem(name="eagle_cluster", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_cluster, iconId = R.drawable.eagle_cluster_bomb_icon),
    Stratagem(name="eagle_napalm", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_napalm, iconId = R.drawable.eagle_napalm_airstrike_icon),
    Stratagem(name="eagle_smoke", typ=stratType.EAGLE.name, enemy="automatons", tags=listOf("smoke"), displayNameID = R.string.eagle_smoke, iconId = R.drawable.eagle_smoke_strike_icon),
    Stratagem(name="eagle_110mm", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_110mm, iconId = R.drawable.eagle_110mm_rocket_pods_icon),
    Stratagem(name="eagle_500kg", typ=stratType.EAGLE.name, enemy="any", tags=listOf(), displayNameID = R.string.eagle_500kg, iconId = R.drawable.eagle_500kg_bomb_icon),
    //support_weapon
    Stratagem(name="weapon_autocannon", typ=stratType.WEAPON.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_autocannon, iconId = R.drawable.autocannon_icon),
    Stratagem(name="weapon_eat", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_eat, iconId = R.drawable.expendable_antitank_icon),
    Stratagem(name="weapon_flamethrower", typ=stratType.WEAPON.name, enemy="terminids", tags=listOf(), displayNameID = R.string.weapon_flamethrower, iconId = R.drawable.flamethrower_icon),
    Stratagem(name="weapon_laser_cannon", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_laser_cannon, iconId = R.drawable.laser_cannon_icon),
    Stratagem(name="weapon_stalwart", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_stalwart, iconId = R.drawable.stalwart_icon),
    Stratagem(name="weapon_machine_gun", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_machine_gun, iconId = R.drawable.machine_gun_icon),
    Stratagem(name="weapon_arc_thrower", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_arc_thrower, iconId = R.drawable.arc_thrower_icon),
    Stratagem(name="weapon_grenade_launcher", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_grenade_launcher, iconId = R.drawable.grenade_launcher_icon),
    Stratagem(name="weapon_anti_materiel", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_anti_materiel, iconId = R.drawable.antimateriel_rifle_icon),
    Stratagem(name="weapon_railgun", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_railgun, iconId = R.drawable.railgun_icon),
    Stratagem(name="weapon_recoiless", typ=stratType.WEAPON.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_recoiless, iconId = R.drawable.recoilless_rifle_icon),
    Stratagem(name="weapon_spear", typ=stratType.WEAPON.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_spear, iconId = R.drawable.spear_icon),
    Stratagem(name="weapon_quasar", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_quasar, iconId = R.drawable.quasar_cannon_icon),
    Stratagem(name="weapon_heavy_machine_gun", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_heavy_machine_gun, iconId = R.drawable.heavy_machine_gun_icon),
    Stratagem(name="weapon_airburst", typ=stratType.WEAPON.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.weapon_airburst, iconId = R.drawable.airburst_rocket_launcher_icon),
    Stratagem(name="weapon_commando", typ=stratType.WEAPON.name, enemy="any", tags=listOf(), displayNameID = R.string.weapon_commando, iconId = R.drawable.commando_stratagem_icon),
    //backpack
    Stratagem(name="backpack_guard_dog_laser", typ=stratType.BACKPACK.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_laser, iconId = R.drawable.guard_dog_rover_icon),
    Stratagem(name="backpack_guard_dog_machine_gun", typ=stratType.BACKPACK.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_guard_dog_machine_gun, iconId = R.drawable.guard_dog_icon),
    Stratagem(name="backpack_jump_pack", typ=stratType.BACKPACK.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_jump_pack, iconId = R.drawable.jump_pack_icon),
    Stratagem(name="backpack_supply", typ=stratType.BACKPACK.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_supply, iconId = R.drawable.shield_generator_pack_icon),
    Stratagem(name="backpack_shield_generator", typ=stratType.BACKPACK.name, enemy="any", tags=listOf("backpack"), displayNameID = R.string.backpack_shield_generator, iconId = R.drawable.shield_generator_pack_icon),
    Stratagem(name="backpack_ballistic_shield", typ=stratType.BACKPACK.name, enemy="automatons", tags=listOf("backpack"), displayNameID = R.string.backpack_ballistic_shield, iconId = R.drawable.ballistic_shield_backpack_icon),
    //sentry
    Stratagem(name="sentry_tesla", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_tesla, iconId = R.drawable.tesla_tower_icon),
    Stratagem(name="sentry_mortar", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_mortar, iconId = R.drawable.mortar_sentry_icon),
    Stratagem(name="sentry_ems_mortar", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_ems_mortar, iconId = R.drawable.ems_mortar_sentry_icon),
    Stratagem(name="sentry_machine_gun", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_machine_gun, iconId = R.drawable.machine_gun_sentry_icon),
    Stratagem(name="sentry_gatling", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_gatling, iconId = R.drawable.gatling_sentry_icon),
    Stratagem(name="sentry_autocannon", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_autocannon, iconId = R.drawable.autocannon_sentry_icon),
    Stratagem(name="sentry_rocket", typ=stratType.SENTRY.name, enemy="any", tags=listOf(), displayNameID = R.string.sentry_rocket, iconId = R.drawable.rocket_sentry_icon),
    //emplacement
    Stratagem(name="emplacement_mines", typ=stratType.EMPLACEMENT.name, enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines, iconId = R.drawable.antipersonnel_minefield_icon),
    Stratagem(name="emplacement_mines_incendiary", typ=stratType.EMPLACEMENT.name, enemy="any", tags=listOf("mines"), displayNameID = R.string.emplacement_mines_incendiary, iconId = R.drawable.incendiary_mines_icon),
    Stratagem(name="emplacement_shield_generator", typ=stratType.EMPLACEMENT.name, enemy="any", tags=listOf(), displayNameID = R.string.emplacement_shield_generator, iconId = R.drawable.shield_generator_relay_icon),
    Stratagem(name="emplacement_hmg", typ=stratType.EMPLACEMENT.name, enemy="any", tags=listOf(), displayNameID = R.string.emplacement_hmg, iconId = R.drawable.hmg_emplacement_icon),
    Stratagem(name="emplacement_mines_antitank", typ=stratType.EMPLACEMENT.name, enemy="any", tags=listOf(), displayNameID = R.string.emplacement_mines_antitank, iconId = R.drawable.md17_antitank_mines_stratagem_icon),
    //vehicle
    Stratagem(name="vehicle_patriot", typ=stratType.VEHICLE.name, enemy="any", tags=listOf(), displayNameID = R.string.vehicle_patriot, iconId = R.drawable.patriot_exosuit_icon),
    Stratagem(name="vehicle_emancipator", typ=stratType.VEHICLE.name, enemy="any", tags=listOf(), displayNameID = R.string.vehicle_emancipator, iconId = R.drawable.emancipator_exosuit_icon)
)