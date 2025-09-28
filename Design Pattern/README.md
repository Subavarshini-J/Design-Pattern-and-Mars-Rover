## Hero Battle: GameApp

## Overview
Hero Battle: GameApp is an interactive Java console game where you take on the role of a hero. Strategically attack or defend, choose your weapons, and face enemies with dynamic abilities. Every decision matters - will you triumph or fall in battle?

Built to demonstrate six key design patterns across behavioral, creational and structural categories, Hero Battle:GameApp combines strategic gameplay, user-driven actions, and clean software design into a single engaging experience.

## Features
- Fully user-controlled gameplay.
- Hero can choose type (Warrior/Mage) and Weapon (Sword/Bow).
- Enemies with dynamic enhancements using Decorator Pattern.
- Health warnings are displayed when hero's health is low using Observer pattern.
- Demonstrates six design patterns in a single game.

## Key Components
- Hero (Player): The main character controlled by the user; can attack or defend and choose weapons.
- Enemies: Opponents with different abilities; can be basic,strong or shielded.
- Weapons: Objects like Sword or Bow used by the hero to deal damage.
- Battle Arena: The environment where the hero and enemies fight.
- Actions/Commands: Hero's moves (Attack/Defend) controlled by the player.
- Health Monitoring: Tracks hero's health and gives warnings when low.
- User Input: Player decisions determine the outcome of the battle.

## Design Patterns
- Behavioral Patterns: <br>
    - Command: Encapsulates hero actions (Attack/Defend).
    - Observer: Monitors hero health and triggers alerts.
- Creational Patterns: <br>
    - Factory: Creates heroes and weapons dynamically.
    - Builder: Flexible construction of hero objects.
- Structural Patterns: <br>
    - Decorator: Enhances enemy abilities dynamically.
- Applies SOLID principles and OOP concepts (Encapsulation, Inheritance, Polymorphism) effectively.

## Code Structure
GameApp/
 - Main.java
 - behavioral/
    - Command.java
    - AttackCommand.java
    - DefendCommand.java
    - CommandInvoker.java
    - Observer.java
    - HealthObserver.java
    - Subject.java
- creational/
    - HeroFactory.java
    - WeaponFactory.java
    - Hero.java
    - Weapon.java
    - BuilderHero.java
- structural/
    - Enemy.java
    - BasicEnemy.java
    - EnemyDecorator.java
    - StrongEnemy.java
    - ShieldedEnemy.java
- game/
    - GameEngine.java
    -  BattleArena.java

## Compilation and Execution
- javac behavioral\*.java
- javac creational\*.java
- javac structural\*.java
- javac game\*.java
- javac Main.java
- java Main
  
## Example Run
 
- Sample testcase 1: <br>

Enter Hero name: Ninja <br>
Choose Hero type (Warrior/Mage): Warrior<br>
Choose weapon: 1. Sword  2. Bow<br>
1<br>

Battle begins!<br>

Your Health: 100 | Enemy Health: 80<br>
Choose Action: 1. Attack  2. Defend<br>
1<br>
Ninja attacks with Sword<br>
Enemy attacks with claws!<br>
This enemy is shielded, harder to damage!<br>
This enemy is stronger!<br>
Enemy health now: 60<br>
Enemy counterattacks!<br>
...

Your Health: 40 | Enemy Health: 20<br>
Choose Action: 1. Attack  2. Defend<br>
1<br>
Ninja attacks with Sword<br>
Enemy attacks with claws!<br>
This enemy is shielded, harder to damage!<br>
This enemy is stronger!<br>
Enemy health now: 0<br>

Ninja defeated the enemy. YOU WIN!<br>
- Sample testcase 2:<br>

Enter Hero name: Kio   <br>
Choose Hero type (Warrior/Mage): Mage<br>
Choose weapon: 1. Sword  2. Bow<br>
1<br>

Battle begins!<br>

Your Health: 100 | Enemy Health: 80<br>
Choose Action: 1. Attack  2. Defend<br>
1<br>
Kio attacks with Sword<br>
Enemy attacks with claws!<br>
This enemy is shielded, harder to damage!<br>
This enemy is stronger!<br>
Enemy health now: 60<br>
Enemy counterattacks!<br>

Your Health: 80 | Enemy Health: 60<br>
Choose Action: 1. Attack  2. Defend<br>
1<br>
Kio attacks with Sword<br>
Enemy attacks with claws!<br>
This enemy is shielded, harder to damage!<br>
This enemy is stronger!<br>
Enemy health now: 40<br>
Enemy counterattacks!<br>
...

Your Health: 10 | Enemy Health: 20<br>
Choose Action: 1. Attack  2. Defend<br>
2<br>
Kio defends and reduces damage!<br>
Warning: Kio's health is very low (0)<br>
Enemy counterattacks!<br>
Warning: Kio's health is very low (0)<br>

Kio has fallen. GAME OVER!<br>

## Contact
For any queries or further information, please reach out to subavarshini454@gmail.com
  
