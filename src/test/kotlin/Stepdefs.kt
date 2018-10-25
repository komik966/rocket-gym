package rocket.gym.test.kotlin

import cucumber.api.java8.Pl

class Stepdefs : Pl {

    init {
        Gdy("wpiszę w pole wartość {string}") { string: String ->
        }

        Zakładając("że w rejestrze istnieje trener, którego umowa kończy się {string}") { string: String ->
        }

        Wtedy("menadżer powinien otrzymać przypomnienie w dniu {string}") { string: String ->
        }
    }
}
