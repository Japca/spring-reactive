import React from 'react'
import List from '../List/List'
import { DROP, LIST, ROOT} from "../Nav/Nav";
import Drop from "../Drop/Drop";
import { Route, Switch } from 'react-router-dom';



const Layout = () => {

    return (
        <Switch>
            <Route exact path={ROOT} component={List}/>
            <Route path={LIST} component={List}/>
            <Route path={DROP} component={Drop}/>
        </Switch>

    )
}

export default Layout;


