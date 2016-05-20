package ifpb.ads.dac;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/05/2016, 23:38:21
 */
@Named
@RequestScoped
public class Hello {

    public String mensagem(){
        return "Oi, Chaves!";
    }
}
