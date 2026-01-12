package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class InventoryMain {
    public static void main(String[] args) {
        // AllArgsConstructor를 활용한 Inventory
        Inventory inventory1 = new Inventory(new Weapon[5]);
        // 추가로 생성한 생성자를 활용한 Inventory
        Inventory myInventory = new Inventory(5);

        // 저희가 지난번에는 main에서 객체를 만들고 그 다음에 중앙 통제에 넣었습니다.
        // 이번에는 인벤토리의 addWeapon()의 argument로 바로 생성자를 호출했습니다.
        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Staff());

        myInventory.attackAll();
        System.out.println();
        myInventory.useSpecialAbilities();

        Sword sword1 = new Sword();
        Bow bow1 = new Bow();
        Staff staff1 = new Staff();

        Weapon[] weapons = {
                new Sword(),
                new Bow(),
                new Staff()
        };

        inventory1.addWeapon(sword1);
        inventory1.addWeapon(bow1);
        inventory1.addWeapon(staff1);
        inventory1.addWeapon(bow1);
        inventory1.addWeapon(sword1);
        inventory1.addWeapon(sword1);   // 인벤토리가 가득 찼습니다.
        System.out.println();
        inventory1.attackAll();
        inventory1.useSpecialAbilities();

    }
}
