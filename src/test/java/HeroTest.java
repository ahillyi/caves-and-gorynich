import com.storymakers.Hero;
import com.storymakers.Npc;
import com.storymakers.Origin;
import com.storymakers.Specialization;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HeroTest {

    private Hero hero;
    private Npc npc;

    @BeforeEach
    void setUp() {
        hero = new Hero("Добрыня",
                "русич",
                new Specialization() {
                }, new Origin());
        npc = new Npc("Упырь");

    }

    @Test
    void attackingNpcTest() {
        hero.attack(30, npc);
        int npcHealthPoints = npc.getHealthPoints();
        assertThat(npcHealthPoints, is(70));
    }
}
