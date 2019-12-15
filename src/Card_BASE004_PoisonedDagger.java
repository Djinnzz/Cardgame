/**
 * Card: Poisoned Dagger
 * ID: BASE004
 *
 * An inconspicuous small dagger with poison dripping from it.
 * */

public class Card_BASE004_PoisonedDagger extends Card_Spell{



        public Card_BASE004_PoisonedDagger(){

            setName("Poisoned Dagger");
            setID("BASE004");

            setType(Type.equipment);
            setEffectText("Equip one thief creature with this card. When the equipped creature gets destroyed by a an attack of one of your opponents creatures, destroy the creature that destroyed the equipped creature.");

            setCreator("Djinnz");

        }
}
