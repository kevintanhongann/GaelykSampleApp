import com.example.domain.Person

/**
 * Created by kevintanhongann on 7/10/15.
 */

log.info "save person"

if(!params.name){
    return
}

if(!params.email){
    return
}

if(!params.tagline){
    return
}

response.contentType = 'application/json'

def person = new Person(name: params.name, email: params.email, tagline: params.tagline)
person.save()

json(person: person)


