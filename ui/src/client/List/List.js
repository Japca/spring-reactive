import React, { Component } from 'react'
import CSSModules from 'react-css-modules'
import style from './list.css'
import Item from '../Item/Item.js'
import classNames from 'classnames'

class List extends Component {

    render() {
        console.info('Test component')
        let items = ['item1', 'item2', 'item3', 'item4']
        return (
            <div styleName='list-container'>
                {items.map(item => <Item key={item} text={item} />)}
            </div>
        )
    }

}


export default CSSModules(List, style)