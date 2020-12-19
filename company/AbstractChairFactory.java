package pr10;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}