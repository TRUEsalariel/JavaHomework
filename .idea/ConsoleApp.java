package JavaHW.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class ConsoleApp {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    //---Description Player
    public static char player = 'P';
    public static String namePlayer = "Hero";
    public static int healthPlayer = 100;
    public static int strPlayer = 30;

    public static int xPosPlayer;
    public static int yPosPlayer;
    public static final int moveUpPlayer = 8;
    public static final int moveLeftPlayer = 4;
    public static final int moveRightPlayer = 6;
    public static final int moveDownPlayer = 2;

    //---Description Location
    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapMin = 3;
    public static int mapMax = 6;
    public static char emptyRoom = '_';
    public static char readyRoom = '+';
    public static boolean isRandomStartPointPlayer = false;


    //---Description Enemy
    public static char enemy = 'E';
    public static char enemyStealth = emptyRoom;
    public static int healthEnemy;
    public static int strEnemy;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 40;
    public static int countEnemies;
    

    public static void main(String[] args) {
        createMap();
        createPlayer(isRandomStartPointPlayer);
        createEnemy();
        printMap();

        while (true) {
            directionPlayer();
            printMap();
//
            if (!isAlivePlayer()) {
                System.out.println(namePlayer + " is dead! ");
                break;
            }
            if (isReadyMap()) {
                System.out.println(namePlayer + " wins!");
                break;
            }
            }
        System.out.println("Goodbye! Game over! "); 
    }

    public static void createMap () {
                mapWidth = myRandom(mapMin, mapMax);
                mapHeight = myRandom(mapMin, mapMax);
                map = new char[mapWidth][mapHeight];
                invisibleMap = new char [mapWidth][mapHeight];

                for (int x = 0; x < mapWidth; x++) {
                    for (int y = 0; y < mapHeight; y++) {
                   map[x][y] = emptyRoom;
                   invisibleMap [x][y] = emptyRoom;
                    }
                }
                System.out.println("New map created. Size " + mapWidth + "x" + mapHeight);
            }

    public static void createPlayer ( boolean isRandom){
                if (isRandom) {
                    xPosPlayer = myRandom(0, mapWidth - 1);
                    yPosPlayer = myRandom(0, mapHeight - 1);
                } else {
                    xPosPlayer = 0;
                    yPosPlayer = 0;
                }
                map[xPosPlayer][yPosPlayer] = player;
                invisibleMap [xPosPlayer][yPosPlayer] = player;
                System.out.println(namePlayer + " has spawned in the room [" + xPosPlayer + ":" + yPosPlayer + "]");
    }

    public static void createEnemy () {
                countEnemies = (mapWidth + mapHeight) / 2;
                healthEnemy = myRandom(enemyValueMin, enemyValueMax);
                strEnemy = myRandom(enemyValueMin, enemyValueMax);
                int xPosEnemy;
                int yPosEnemy;
                for (int i = 0; i < countEnemies; i++) {

                    do {
                        xPosEnemy = random.nextInt(mapWidth); //locWidth
                        yPosEnemy = random.nextInt(mapHeight); //locHeight
                        System.out.println("Enemy spawns at: " + xPosEnemy + " : " + yPosEnemy);
                    } while (xPosEnemy == xPosPlayer && yPosEnemy == yPosPlayer && !isEmptyRoom(invisibleMap, xPosEnemy, yPosEnemy));

                    invisibleMap[xPosEnemy][yPosEnemy] = enemyStealth;
                                    }
                System.out.println("Enemies have spawned. Their number is " + countEnemies + ", HP= " + healthEnemy + ", STR= " + strEnemy);
    }

    public static void directionPlayer() {
                int currentX = xPosPlayer;
                int currentY = yPosPlayer;
                int playerMoveValue;
                do {
                    System.out.print("Enter destination:(UP " + moveUpPlayer + " | Down " + moveDownPlayer + " | Right "
                            + moveRightPlayer + " | Left " + moveLeftPlayer + " ) >>> ");
                    playerMoveValue = scanner.nextInt();

                    switch (playerMoveValue) {
                        case moveUpPlayer:
                            xPosPlayer -= 1;
                            break;
                        case moveDownPlayer:
                            xPosPlayer += 1;
                            break;
                        case moveLeftPlayer:
                            yPosPlayer -= 1;
                            break;
                        case moveRightPlayer:
                            yPosPlayer += 1;
                            break;
                    }
                } while (!isValidMovePlayer(currentX, currentY, xPosPlayer, yPosPlayer));
                playerNextMoveAction(currentX, currentY, xPosPlayer, yPosPlayer);
            }

    public static void playerNextMoveAction(int lastX, int lastY, int nextX, int nextY){
                if (invisibleMap[nextX][nextY] == enemyStealth) {
                    healthPlayer -= strEnemy;
                    countEnemies--;
                    System.out.println(" Warning! You are under attack! Enemy attacks " + namePlayer + " with " + strEnemy + " damage." + namePlayer + " health is " + healthPlayer);
                    System.out.println(" Enemies count is " + countEnemies);
                }
                map[lastX][lastY] = readyRoom;
                map[nextX][nextY] = player;
                invisibleMap[lastX][lastY] = readyRoom;
                invisibleMap[nextX][nextY] = player;
    }

    public static boolean isValidMovePlayer(int currentX, int currentY, int nextX, int nextY){
                if (nextX >= 0 && nextX < mapWidth && nextY >= 0 && nextY < mapHeight) {
                    System.out.println(namePlayer + " moves to [" + nextX + ":" + nextY + "] ");
                    return true;
                } else {
                    System.out.println("Invalid move! Try again! ");
                    xPosPlayer = currentX;
                    yPosPlayer = currentY;
                    return false;
                }
    }

    public static boolean isEmptyRoom(char[][] map, int x, int y){
                return map[x][y] == emptyRoom;
    }

    public static void printMap () {
                System.out.println("=====> LOCATION <=====");
                for (int x = 0; x < mapWidth; x++) {
                    for (int y = 0; y < mapHeight; y++) {
                        System.out.print(invisibleMap[x][y] + "|");
                    }
                    System.out.println(" ");
                }
                System.out.println("=====> LOCATION <=====");
    }

    public static int myRandom ( int min, int max){
                return min + random.nextInt(max - min + 1);
    }

    public static boolean isAlivePlayer () {
                return healthPlayer > 0;
    }

    public static boolean isReadyMap () {
                for (int x = 0; x < mapWidth; x++) {
                    for (int y = 0; y < mapHeight; y++) {
                        if (map[x][y] == emptyRoom) {
                            return false;
                        }
                    }
                }
                return true;
    }
    }

