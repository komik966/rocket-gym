package rocket.gym.test.kotlin

import cucumber.api.java8.Pl

class Stepdefs : Pl {

    init {
        Jeżeli("jestem \"([^\"]*)\"") {
        }
        Gdy("gdy spróbuję dodać nowego trenera z danymi:") { dataTable: io.cucumber.datatable.DataTable ->
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

        Wtedy("dostępność trenera jest maksymalnie do \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Zakładając("w rejestrze istnieje trener, którego umowa kończy się \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }

        Wtedy("powinienem otrzymać przypomnienie w dniu \"([^\"]*)\"") { string: String ->
            // Write code here that turns the phrase above into concrete actions
            throw cucumber.api.PendingException()
        }
    }
}
