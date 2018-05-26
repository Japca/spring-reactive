import React from 'react'
import List from '../List/List'
import { DROP, LIST, MODAL, ROOT} from "../Nav/Nav";
import Drop from "../Drop/Drop";
import Modal from "../Modal/Modal"
import { Route, Switch } from 'react-router-dom';



const Layout = () => {

    return (
        <Switch>
            <Route exact path={ROOT} component={List}/>
            <Route path={LIST} component={List}/>
            <Route path={DROP} component={Drop}/>
            <Route path={MODAL} component={Modal}/>
        </Switch>

    )
}

export default Layout;


