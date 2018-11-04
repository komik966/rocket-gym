package rocket.gym.test.kotlin

import cucumber.api.java8.Pl

class Stepdefs : Pl {

    init {
        Jeżeli("jestem \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Gdy("gdy dodam nowego trenera z danymi:") { dataTable: io.cucumber.datatable.DataTable ->
            // Write code here that turns the phrase above into concrete actions
            // For automatic transformation, change DataTable to one of
            // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
            // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
            // Double, Byte, Short, Long, BigInteger or BigDecimal.
            //
            // For other transformations you can register a DataTableType.
            throw cucumber.api.PendingException()
        }

        Wtedy("nowy trener powinien pojawić się na liście") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("nowy trener powinien pojawić się w kalendarzu dostępności") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("dostępność trenera jest w przedziale od teraz do \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("mogę modyfikować wszystie dane trenera") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("nie mogę modyfikować umowy trenera") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Jeżeli("w rejestrze istnieje trener, którego umowa kończy się \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("otrzymam przypomnienie w dniu \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Jeżeli("trener ma średnią ocenę ([^\"]*) wystawioną przez ([^\"]*) klientów") { double1: Double, int1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Gdy("dodam ocenę ([^\"]*) z komentarzem \"([^\"]*)\"") { int1: Int, string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("ocena trenera powinna być ([^\"]*)") { double1: Double ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("dodana ocena powinna być pierwsza na liście") {
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }
    }
}
