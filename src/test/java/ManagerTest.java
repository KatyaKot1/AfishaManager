import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    @Test
    public void shouldAddFilm() {
        Manager manager = new Manager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        Manager manager = new Manager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");

        String[] actual = manager.findLast();
        String[] expected = {
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2"

        };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        Manager manager = new Manager();

        manager.add("film1");

        String[] actual = manager.findAll();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnIfNotAddFilms() {
        Manager manager = new Manager();

        String[] actual = manager.findAll();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnFilmsIfThereAreMoreThenLimit() {
        Manager manager = new Manager(5);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10",
                "film9",
                "film8",
                "film7",
                "film6"};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldReturnFilmsIfThereAreLessThenLimit() {
        Manager manager = new Manager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        String[] actual = manager.findLast();
        String[] expected = {"film5",
                "film4",
                "film3",
                "film2",
                "film1"
        };
        assertArrayEquals(expected, actual);
    }
    @Test
    public void getShouldReturnResultFilmsIfThereIsUpToLimit() {
        Manager manager = new Manager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3",
                "film2",
                "film1"
        };
        assertArrayEquals(expected, actual);
    }
}


