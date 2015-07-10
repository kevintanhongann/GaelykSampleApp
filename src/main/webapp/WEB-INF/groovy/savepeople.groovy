import com.example.domain.Person

/**
 * Created by kevintanhongann on 7/10/15.
 */

log.info "save person"

response.contentType = 'application/json'

def person = new Person(name: params.name, email: params.email, tagline: params.tagline)
if(person.save()){
    json(person: person)
}



