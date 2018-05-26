import React, { Component } from 'react';
import CSSModules from 'react-css-modules'
import style from './item.css'


class Item extends Component {

    render() {
        return (
            <div styleName='item-container'>
            <div styleName="item-left">I</div>
            <div styleName="item-right">I</div>
            </div>
        )
    }
}

export default CSSModules(Item, style);

