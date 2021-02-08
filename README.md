# Projet Stage - USHIP GESTION V1.0

USHIP GESTION est un logiciel développé en Java 8 (NetBeans), il permet de gérer les systèmes de ventes d'une entreprise ainsi que d'effectuer des ventes au près des clients.

## Documentation et informations 📕

- 📚 [Voir la documentation](https://docs.google.com/document/d/1pQ6byV07CO8u2E9mGfx29PC48VQNcCja2vEqIatVqe0/edit?usp=sharing)
- 📕 Pour accèder au logiciels les identifiants admin sont : Login (admin) Mot de passe (admin), une fois connecté vous pouvez gérer les utilisateurs

## Requis 🖱️

- 🖊️ IDE - Environnement de développement (Intelij Community, NetBeans 12.0 recommendé pour avoir accès à Swing)
- ♨️ Développent Kit - Kit de développement [Telecharger un kit de développement](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)
- 📚 PhpMyAdmin - Un serveur de Base de données MySql comme PhpMyAdmin
- 🌀 Maven - Outil de gestion et d'automatisation de production des projets logiciels en Java  

# Installation sous Linux 📁

## Etape 1 - Installation de PhpMyAdmin sous Linux 📁

[Tutoriel pour les utilisateurs de Linux](http://elisabeth.pointal.org/doc/code/server/lamp/phpmyadmin).

## Etape 2 - Cloner le projet sur Intelijj 📁

Creer un projet en Java JDK 8 
 - Prenez la src + lib sur github et les placer dans IdeaProject (Pour Intelijj)
 - N'oubliez pas d'importer les librairies 

## Etape 2Bis - Cloner le projet sur la machine virtuel sous linux 📁

♨️ Pour installer le JAR, il suffit de cloner le repository depuis votre machine linux:

  - mkdir nomDeVotreProjet
  - cd nomDeVotreProjet
  - git clone https://github.com/SheillOG/stage2021.git

# Installation sous Windows Wamp Server 📁

Pour commencer l'installation il faut installer MySQL et PhpMyAdmin, il est possible de les installer grâce à WAMP (Windows).
Voici un lien pour le télécharger: [WampServer](https://www.wampserver.com/en/download-wampserver-64bits/)

- Telecharger le Stage2021.sql présent sur github
- Lancer WampServer
- Connectez vous sur PHPMyAdmin [Cliquer ici pour vous rendre sur la page PhpMyAdmin](http://127.0.0.1/phpmyadmin/)
- Login: root MotDePasse: aucun
- Rendez vous dans Importer
- Choisir un fichier (Dans notre cas le dossier Stage2021) et selectionner le fichier Stage2021.sql
- Executer le fichier

- Ensuite utiliser la documentation afin d'avoir des informations sur le logiciel ansi qu'une notice d'utilisation
- [Cliquer ici pour avoir accès a la documentation](https://docs.google.com/document/d/1pQ6byV07CO8u2E9mGfx29PC48VQNcCja2vEqIatVqe0/edit?usp=sharing)

# Si vous rencontrez un problème de lancement des classes 📁
 - Recreer un projet Java JDK 8 
 - Prenez la src + lib sur github et les placer dans IdeaProject (Pour Intelijj)
 - N'oubliez pas d'importer les librairies 
