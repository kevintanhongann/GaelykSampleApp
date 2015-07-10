import com.example.domain.Person
import com.google.appengine.api.datastore.*

def person = new Person(name: 'kevin tan', email: 'kevintan@kevintan.com', tagline: 'test tagline').save()

def entity = new Entity('person')
entity.name = 'kevin tan'